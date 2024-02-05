package com.Kira.Service;

import com.Kira.Entity.GameRepository;
import com.Kira.Entity.Model.Game;
import com.Kira.Entity.Model.Player;
import com.Kira.Entity.Model.Room;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
/*
+ getId()
+ setId()
+ getNumberOfPlayers(): int
+ setNumberOfPlayers()
+ getPlayers(): ArrayList<Player>
+ addPlayer(player: Player): void
+ getWinningTeam():
+ startGame(): void
+ endGame(): void
+ assignRoles(): void*/

@Service
@AllArgsConstructor
public class GameService {
    private  final RoomService roomService;
    private  final GameRepository gameRepository;
  //  private final PlayerService playerService;(暫時沒有該層邏輯)

    //拿來裝現有玩家資訊取代addPlay方法
    public List<Player> playerList=new ArrayList<>();

    public List<Game> findAll(){
//        List<Game> gameList=gameRepository.findAll();
        return gameRepository.findAll(); //gameList;
    }

    public Optional<Game> findGameById(String Id){
        return gameRepository.findById(Id);
    }

    public String createGame(Game game){
        //後續新增防呆暫時先這樣
        Game newGame=new Game();
        newGame.setId(game.getId());
        newGame.setPlayers(game.getPlayers());
        newGame.setPlayerNumber(game.getPlayerNumber());
        newGame.setResults(game.getResults());
        gameRepository.save(newGame);
        return "Sucess";
    }
    public String updateGame(String Id,Game game){
        Optional<Game> gameDetail=gameRepository.findById(Id);
        if(gameDetail.isEmpty()){
            return "該筆資料不存在";
        }
        gameRepository.save(game);
        return "修改成功";
    }
    public String deleteGame(String Id){
        Optional<Game> game=gameRepository.findById(Id);
        if(game.isEmpty()){
            return "該遊戲不存在";
        }
        gameRepository.deleteById(Id);
        return "成功";
    }
    public Room getRoom(Room room){
        //目前的玩家數量Room上 (只需call一次 for 分配角色)
        //若只有getRoom後續把邏輯移至assignRoles?
        roomService.getRoomById(String.valueOf(room.getId()));
        return  null;
    }
    public List<Player> resivePlayerDetail(){
        //現有的Player資訊都在這
        //修改為調整目前的playerList內的資訊
        return  null;
    }

    public void startGame(){
        //遊戲運行邏輯
    }
    public void endGame(){
      //是否併至Start?
      //若是遊戲的中止邏輯 是否要把GetWinnerTeam放在這?
    }

    public void assignRoles(){
        //分配目前角色
    }
}
