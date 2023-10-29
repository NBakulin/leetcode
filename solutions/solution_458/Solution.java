package solutions.solution_458;

class Solution
{
    public int poorPigs(int buckets, int tdie, int ttest)
    {
        int testsCount = ttest / tdie + 1;
        double pig = Math.floor(Math.log(buckets) / Math.log(testsCount));
        if(buckets > Math.pow(testsCount, pig))
            pig = pig + 1;
        return (int)pig;
    }
}
