
#include <iostream>
using namespace std;
 

class gfg
{
     
public : double sum(int n)
{
    double i, s = 0.0;
    for (i = 1; i <= n; i++)
    s = s + 1/i;
    return s;
}
};
 

int main()
{
    gfg g;
 int n = Integer.parseInt(System.getenv("val"));
    //int n = 5;
    cout << "Sum is " << g.sum(n);
    return 0;
}
 
