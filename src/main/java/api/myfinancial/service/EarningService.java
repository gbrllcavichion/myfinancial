package api.myfinancial.service;

import api.myfinancial.dto.*;

import java.util.*;

public interface EarningService {
    List<Earning> getAllEarnings (String userId);
    Earning addEarning(String userId, Earning earning);

}
