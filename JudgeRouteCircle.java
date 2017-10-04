class JudgeRouteCircle {
    public boolean judgeCircle(String moves) {
        int x=0,y=0;
        //Assuming the intial position is origin (0,0)
        for(int i=0; i<moves.length();i++){
            char move = moves.charAt(i);
            if(move == 'L') x--;
            else if(move == 'R') x++;
            else if(move == 'U') y++;
            else y--;
        }
        return(x==0 && y==0);
    }
}
