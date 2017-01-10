import scala.util.control.Breaks._

object BinarySearch {
    
	def search(a: Array[Int], x: Int, min: Int, max: Int) {
		var result = -1;
		var i = 0;
		var l = min;
		var r = max;
		while(l <= r) {
			i = math.floor( (l + r) / 2 ).toInt;
			if(a(i) == x) {
				result = i;
				l = r + 1;
			} else if(x < a(i)) {
				r = i - 1;
			} else {
				l = i + 1;
			}
			
		}
		println(result);
    }
    
    def main(args: Array[String]) {
    	println("Binary Search");
      
    	var a :Array[Int] = Array(2,5,7,15,25,33,46,64,78);
      
    	search(a,5,0,a.length-1);
	}
}