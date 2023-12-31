package api.myfinancial.service.earning;

import api.myfinancial.dto.*;

import java.util.*;

public interface EarningService {
    List<Earning> getAllEarnings (String userId);
    Earning addEarning(String userId, Earning earning);

}
