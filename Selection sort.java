        int min; 
		      
		for (int i = 0; i < arr.length; i++) {
			min=i;
			for (int j = i+1; j < arr.length; j++) {
				if (arr[j]>arr[min]) {
					min=j;
				}
				
			}
			int t=arr[i];
			arr[i]=arr[min];
			arr[min]=t;
		}