public class TowerofHanoi{
    public static void towerofHanoi(int n, char src, char aux, char dest){
        if(n == 1){
            System.out.println("Move disk "+ n + " " + src + " -> " + dest);
            return;
        }

        towerofHanoi(n - 1, src, dest, aux);
        System.out.println("Move disk "+ n + " "+ src + " to " + dest);
        towerofHanoi(n - 1, aux, src, dest);
    }

    public static void main(String[] args)
    {
        int n = 3;
        towerofHanoi(n, 'A', 'B', 'C');
    }
}