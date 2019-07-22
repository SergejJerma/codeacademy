import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.BiFunction;

public class Testas {

	public static void main(String[] args) {

	BiFunction<Double, Double, Double> f;
	f = (val1, val2) -> (val1*val2);
	System.out.println(f.apply(3.5, 2.0));
	}

}
