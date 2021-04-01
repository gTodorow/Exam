#include<stdio.h>
int main()
{
  int a,b,c,V,S;
  printf("a = ");
  scanf("%d", &a);
  printf("b = ");
  scanf("%d", &b);
  printf("c = ");
  scanf("%d", &c);
  
  if(a > 0 && b>0 && c>0){
  	V = a * b * c;
  	printf("V  = %d\n", V);
  	S = 2*(a*c + b*c);
  	printf("S  = %d\n", S);
  }else{
  	printf("Invalid figure!");
  }
  return 0;
}
