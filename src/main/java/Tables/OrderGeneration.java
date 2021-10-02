package Tables;

import com.example.dinninghallapi.DinningHallApiApplication;


public class OrderGeneration implements Runnable {

    private Table[] tables;

    public OrderGeneration(Table[] tables) {
        this.tables = tables;
    }

    @Override
    public void run() {

        int tableId;

        while (true)
        {
            try { DinningHallApiApplication.timeUnit.sleep(7); }
            catch (InterruptedException e) { e.printStackTrace(); }

            if (Math.random()>0.7)
            {
                do tableId = (int) (Math.random() * tables.length-1 + 0);
                while (tables[tableId].getState()!=TableState.Free);

                tables[tableId].generateOrder();
                tables[tableId].switchState(TableState.WaitingMakingOrder);
            }

        }

    }



}