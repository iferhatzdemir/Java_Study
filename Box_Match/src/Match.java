public class Match {
    Fighter f1;
    Fighter f2;
    int maxKilos;
    int minKilos;
    Match(Fighter f1, Fighter f2,int minKilos,int maxKilos) {
        this.f1 = f1;
        this.f2 = f2;
        this.minKilos = minKilos;
        this.maxKilos=maxKilos;
    }
    boolean isChecked() {
        return (this.f1.weight<=maxKilos&&this.f1.weight>=minKilos && this.f2.weight<=maxKilos&&this.f2.weight>=minKilos);
    }

    public void run(){int i=1;
       if(f1.lucky>f2.lucky){
           if(isChecked()){

               while (true){
                   System.out.println("=========== "+i+".  ROUND ==========");
                   this.f2.health=this.f1.hit(f2);
                   System.out.println(f2.name+"'s  remaining health:"+this.f2.health);
                   if (isWin()){
                       break;
                   }
                   this.f1.health=this.f2.hit(f1);
                   System.out.println(f1.name+"'s  remaining health:"+this.f1.health);
                   if (isWin()){
                       break;
                   }
                   i++;

               }
           }else System.out.println("The Conditions Are Not Equal for Two Fighters");
       }else{
           if(isChecked()){
               while (true){
                   System.out.println("=========== "+i+". ROUND ==========");
                   this.f1.health=this.f2.hit(f1);
                   System.out.println(f1.name+"'s  remaining health:"+this.f2.health);
                   if (isWin()){
                       break;
                   }
                   this.f2.health=this.f1.hit(f2);
                   System.out.println(f2.name+"'s  remaining health:"+this.f1.health);
                   if (isWin()){
                       break;
                   }
                   i++;
               }
           }else System.out.println("The Conditions Are Not Equal for Two Fighters");
       }
    }
    boolean isWin() {

        if (this.f1.health==0){
            System.out.println("*******************************");
            System.out.println("\t\tWinner :"+this.f2.name);
            return true;

        }else if (this.f2.health==0){
            System.out.println("*******************************");
            System.out.println("\t\tWinner :"+this.f1.name);
            return true;

        }else return false;
    }
}
