package tower;

public class TowerSolver {
    private TowerModel model;

    public TowerSolver()
    {
        // Nothing to do here
    }

    public void solve(TowerModel model)
    {
        this.model = model;
        solve(model.getHeight(), 0, 2, 1);
    }

    private void solve(int n, int source, int dest, int aux)
    {
        if (n == 1)
        {
            model.move(source, dest);
            return;
        }

        solve(n - 1, source, aux, dest);
        model.move(source, dest);
        solve(n - 1, aux, dest, source);
    }
}