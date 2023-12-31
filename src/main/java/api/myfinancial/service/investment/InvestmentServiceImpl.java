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
    public List<Investment> getAllInvestments(String userId){
        User user = userRepository.findById(userId).orElse(null);

        if (user != null) {
            return user.getInvestments();
        } else {
            throw new IllegalArgumentException("User not found");
        }
    }

    @Override
    public void addInvestment(String userId, Investment investment){
        User user = userRepository.findById(userId).orElse(null);

        if(user != null) {
            Investment newInvestment = new Investment();
            newInvestment.setDate(new Date());
            newInvestment.setDescription(newInvestment.getDescription());
            newInvestment.setValueBefore(investment.getCurrentBalance());
            newInvestment.setAmoundAdded(investment.getAmountToAdd());
            double totalInvestment = investment.getCurrentBalance() + investment.getAmountToAdd();
            newInvestment.setTotalAmountInvested(totalInvestment);

            user.setTotalInvestment(totalInvestment);
            user.getInvestments().add(newInvestment);
            userRepository.save(user);
        } else {
            throw new IllegalArgumentException("User not found");
        }
    }
}