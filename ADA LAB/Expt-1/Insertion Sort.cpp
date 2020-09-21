#include<iostream>
#include <ctime>
#include<stdio.h>
#include<conio.h>
using namespace std;

int main()
{
  clock_t c_start = clock();
  int n, i, j, key;

  cout<<"Enter the Number of Elements: ";
  cin>>n;
  
  int arr[n];
  
  cout<<"Enter the Elements: ";

  for(i = 0;i < n;i++)
  {
    cin>>arr[i];
  }

  for(i = 0;i < n;i++)
  {
    key = arr[i];
    j = i-1;
      while(j >= 0 && arr[j] > key)
      {
        arr[j+1] = arr[j];
        j = j -1;
      }
    arr[j+1] = key;
  }

  cout<<"Sorted array using Insertion sort: ";
  
  for(j = 0;j < n;j++)
  {
    cout<<arr[j]<<" ";
  }

  clock_t c_end = clock();
  long double time_elapsed_ms = 1000.0 * (c_end-c_start) / CLOCKS_PER_SEC;
  
  cout << "\nCPU time used: " << time_elapsed_ms << " ms\n";
}
