package api.myfinancial.service.investment;

import api.myfinancial.dto.*;

import java.util.*;

public interface InvestmentService {
    List<Investment> getAllInvestments(String userId);
}
