package domain.rules;

import domain.Move;
import domain.Result;
import domain.Rules;

public class RockPaperScissors implements Rules {
    @Override
    public Result decide(Move mine, Move theirs) {
        if(mine.equals(theirs)){
            return Result.DRAW;
        }
        else{
            if(mine.equals(Move.ROCK)){
                if(theirs.equals(Move.PAPER)){
                    return Result.LOSE;
                }
                else{
                    return Result.WIN;
                }
            }
            if(mine.equals(Move.PAPER)) {
                if(theirs.equals(Move.ROCK)) {
                    return Result.WIN;
                }else{
                    return Result.LOSE;
                }

            }
            if(mine.equals(Move.SCISSORS)) {
                if (theirs.equals(Move.PAPER)) {
                    return Result.WIN;
                } else {
                    return Result.LOSE;
                }

            }
        }

        return Result.DRAW;
    }
}
