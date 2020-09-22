#include<iostream>
#include<stdio.h>
#include<conio.h>
#include <ctime>
using namespace std;

void merge(int arr[], int p, int q, int r)
{
  int n1, n2, i, j, k;
  n1 = q - p + 1;
  n2 = r - q;
  int left[n1+1], right[n2+1];

  for(i = 1;i < n1+1;i++)
  {
    left[i] = arr[p+ i- 1];
  }

  for(i = 1;i < n2+1;i++)
  {
    right[i] = arr[q + i];
  }
  left[n1+1] = 100;
  right[n2+1] = 100;
  
  i=1;
  j=1;
  
  for(k = p;k < r+1;k++)
  {
    if(left[i] <= right[j])
    {
      arr[k] = left[i];
      i+=1;
    }
    else
    {
      arr[k] = right[j];
      j+=1;
    }
  }
}

void merge_sort(int arr[], int p, int r)
{
  int q;

  if(p < r)
  {
    q = (p + r)/2;
    merge_sort(arr, p, q);
    merge_sort(arr, q+1, r);
    merge(arr, p, q, r);
  }
}

int main()
{

  clock_t c_start = clock();
  int n, p, r, i, j;
  
  cout<<"Enter the Number of elements: ";
  cin>>n;
  
  int arr[n];

  cout<<"Enter the elements: ";
  
  for(i=0;i<n;i++)
  {
    cin>>arr[i];
  }

  merge_sort(arr, 0, n-1);
  cout<<"Sorted array after Merge Sort: ";
  for(i = 0;i<n;i++)
  {
    cout<<arr[i]<<" ";
  }

  clock_t c_end = clock();
  long double time_elapsed_ms = 1000.0 * (c_end-c_start) / CLOCKS_PER_SEC;
  cout << "\nCPU time used: " << time_elapsed_ms << " ms\n";
}
