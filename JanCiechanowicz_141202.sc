def last4(str1: String): String = {
    str1.take(str1.length() - 4) + str1.drop(str1.length() - 4).toUpperCase()
   }
def find_min_subarray_sum(nums: Array[Int], k:Int): Int = {
  var sub_arr_sum = 0;
	var min_sub_arr = Integer.MAX_VALUE;
	for ( i<- 0 to nums.length-1)
	{
		sub_arr_sum += nums(i);

		if (i + 1 >= k)
		{
			if (min_sub_arr > sub_arr_sum)
			{
				min_sub_arr = sub_arr_sum 
				
			}

			sub_arr_sum -= nums(i + 1 - k);
		}
	}
	
    min_sub_arr
}
print(last4("si34ewe"))

val result = find_min_subarray_sum(Array(1,2,3,4,5), 2);
println("\nmin subarray sum is:"+result.toString);

def checkForSubstrings(stng: String,fstsub: String,scnsub: String) = {
  var l = stng.length;
  var first = 0;
  var second = 0;
  for (i <- 0 to l-1) 
  {
    if (i < l - (fstsub.length()-1)) 
	{
      var tmp = stng.substring(i,i+fstsub.length());
      if (tmp.equals(fstsub))
        first  +=1;
    }
    if (i < l - (scnsub.length()-1)) 
	{
      var tmp2 = stng.substring(i,i+scnsub.length());
      if (tmp2.equals(scnsub))
        second += 1;
    }
  } 
 println("in string "+stng+" string "+fstsub+" appears "+first.toString+" times "+"and string "+scnsub+" appears "+second.toString+" times");
  }
 checkForSubstrings("hellowecheckingforsubstrings","e","sub")