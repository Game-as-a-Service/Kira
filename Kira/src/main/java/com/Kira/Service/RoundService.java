package com.Kira.Service;

import com.Kira.Entity.Model.Round;
import com.Kira.Entity.Model.Round.RoundTime;
import com.Kira.Entity.RoundRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class RoundService {

    private final RoundRepository roundRepository;

    // 透過 GameId 取得回合資料
    public Round getRoundByGameId(Integer gameId) {
        return roundRepository.findByGameId(gameId);
    };

//    // TODO: 這個好像可以放前端判斷...
//    public String getRoundNotify(Integer gameId, Integer currentRound, RoundTime roundTime) {
//        Round round = roundRepository.findByGameId(gameId);
//        if (currentRound == 1 && roundTime == RoundTime.NIGHT) {
//            return "第一天晚上殺手出來殺人大家小心";
//        }
//        return "";
//    };
}
