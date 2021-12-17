#include<stdio.h>

int main()
{
    	int calls, minimum = 300;
    	float bill;
    	scanf("%d",&calls);

    	if(calls<=120)
    	{
        		bill = minimum ;
    	}
    	else if(calls>120 && calls <= 190)
    	{
    		bill = minimum + (calls-120)*1 ;
    	}
    	else if(calls >190 && calls <=240)
    	{
    		bill = minimum + 70 + (calls-190)* 0.82;
    	}
    	else
    	{
    		bill = minimum + 111 + (calls-240)*0.45;
    	}

    	printf("Bill is : %f",bill);

return 0;
}

Cyclomatic Complexity:
The cyclomatic complexity of the above flow graph is,
Number of edges=11
Number of nodes=9
Therefore, Cyclomatic Complexity = Number of edges-11Number of nodes+2
         = 11-9+2	
         = 4

Independents Paths:
The possible independent paths are,
Path-1: 1-2-3-9
Path-2: 1-2-4-5-9
Path-3: 1-2-6-7-9
Path-4: 1-2-6-8-9

Test Matrix:

Path	1	2	3	4	5	6	7	8	9
1	✔	✔	✔						✔
2	✔	✔		✔	✔				✔
3	✔	✔				✔	✔		✔
4	✔	✔				✔		✔	✔





