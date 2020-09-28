#include<ctime>
#include<iostream>
#include<conio.h>
#include<stdio.h>
using namespace std;

void takeInput(int a[],int n)
{
  for(int i = 0; i < n; i++)
  {
    cin>>a[i];
  }
}

int linearSearch(int a[], int num, int size)
{
  for(int i = 0; i < size; i++)
  {
    if(a[i] == num)
    {
      return i;
    }
  }

  return -1;
}

int main()
{
  clock_t c_start = clock();
  int n,m;
  int a[30];

  cout<<"Enter the number of elements: ";
  cin>>n;

  cout<<"Enter the elements : ";
  
  takeInput(a,n); //takeInput function calling

  cout<<"Enter the number to be searched: ";
  cin>>m;

  int ans = linearSearch(a,m,n);
  
  cout<<"Element is present at index : "<< ans;

  clock_t c_end = clock();
  long double time_elapsed_ms = 1000.0 * (c_end-c_start) / CLOCKS_PER_SEC;
  cout << "\nCPU time used in Linear Search: " << time_elapsed_ms << " ms\n";
  return 0;
}
