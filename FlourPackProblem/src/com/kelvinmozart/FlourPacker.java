package com.kelvinmozart;

public class FlourPacker{

    public static boolean canPack(int bigCount, int smallCount, int goal){

        //bigCount big flour bags, 5 kilos each
        //smallCount small flour bags, 1 kilo each
        //goal amount of kilos of flour needed to assemble a package

        if( bigCount < 0 || smallCount < 0 || goal < 0 ){
            return false;
        }else if( bigCount == 0 && goal <= smallCount ){
            return true;
        }else if( bigCount*5 == goal && smallCount == 0 ){
            return true;
        }else if( bigCount*5 > goal ){
            for(int i=bigCount; i>0; i--){
                if( goal-i*5 >= 0 && goal-i*5 <= smallCount ){
                    return true;
                }
            }
        }else if( bigCount*5 < goal && goal-bigCount*5 <= smallCount ){
            return true;
        }
        return false;
    }
}
