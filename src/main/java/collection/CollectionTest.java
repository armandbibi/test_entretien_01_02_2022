package collection;

import java.util.List;
import java.util.stream.Collectors;
import java.lang.Math;

/**
 * You should complete the function in this class
 * <p>
 * Feel free to define any method and / or class you want
 */
class CollectionTest {


  /**
   * operation : x -> ((x * 2) + 3) ^ 5
   */
  public static List<Double> compute1(List<Integer> input) {

    return input.stream().mapToDouble(
      x -> Math.pow(Double.valueOf((x * 2) + 3), 5)
    ).boxed().collect(Collectors.toList());
  }


  private static String capitalizeFirstLetter(String string) {

    if (string.length() > 0)
      return string.substring(0,1).toUpperCase() + string.substring(1);
    else
      return string;
  }

  /**
   * operation : abc -> AbcAbc
   */
  public static List<String> compute2(List<String> input) {

    return input.stream().map(x -> capitalizeFirstLetter(x) + capitalizeFirstLetter(x)).collect(Collectors.toList());
  }

}
