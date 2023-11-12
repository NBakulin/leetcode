package solutions.solution_815;

public class RouteNode<stop, busRoute> {
    public int stop;
    public int busRoute;

    public RouteNode(int stop, int busRoute) {
        this.stop = stop;
        this.busRoute = busRoute;
    }
}
