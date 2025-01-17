int rotated[5];
List<Integer>rotated=new ArrayList;
int n = arr.size();
for(int i=0; i<n; i++){
rotated.add(arr.get(i+a)%n);
}
return rotated;