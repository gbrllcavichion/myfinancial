package api.myfinancial.service;

import api.myfinancial.domain.*;
import api.myfinancial.dto.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@AllArgsConstructor
@Service
public class EarningServiceImpl implements EarningService {

    @Autowired
    private final EarningRepository earningRepository;

    @Autowired
    private final UserRepository userRepository;

    @Override
    public List<Earning> getAllEarnings(String userId) {
        User user = userRepository.findById(userId).orElse(null);

        if (user != null) {
            return user.getEarnings();
        } else {
            throw new IllegalArgumentException("User not found");
        }
    }

    @Override
    public Earning addEarning(String userId, Earning earning) {
        User user = userRepository.findById(userId).orElseThrow(() -> new IllegalArgumentException("User not found"));

        if (earning.getDate() == null) {
            earning.setDate(new Date());
        }

        user.getEarnings().add(earning);

        Earning addedEarning = earningRepository.save(earning);

        double earningAmount = earning.getAmount();
        user.setBalance(user.getBalance() + earningAmount);
        userRepository.save(user);

        return addedEarning;
    }
}
