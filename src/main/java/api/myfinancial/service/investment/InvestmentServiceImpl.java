package api.myfinancial.service.investment;

import api.myfinancial.domain.*;
import api.myfinancial.dto.*;
import lombok.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.*;

import java.util.*;

@AllArgsConstructor
@Service
public class InvestmentServiceImpl implements InvestmentService {

    @Autowired
    private final InvestmentRepository investmentRepository;

    @Autowired
    private final UserRepository userRepository;

    @Override
    public List<Investment> getAllInvestments(String userId) {
        User user = userRepository.findById(userId).orElse(null);

        if (user != null) {
            return user.getInvestments();
        } else {
            throw new IllegalArgumentException("User not found");
        }
    }

}
