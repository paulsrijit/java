package java8practice.lambdaexpression.inpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Predicate;

/**
 *
 * @author MikeW
 */
public class SearchCriteria {

  private final Map<String, Predicate<Person>> searchMap = new HashMap<>();

  SearchCriteria() {
    super();
    initSearchMap();
  }

  private void initSearchMap() {
    Predicate<Person> adultCriteria = p -> p.getAge() >= 18;
    Predicate<Person> studentCriteria = p -> p.getAge() <=17;
    Predicate<Person> middleAgedCriteria = p -> p.getAge() >= 40 && p.getAge() <= 50;

    searchMap.put("adultCriteria", adultCriteria);
    searchMap.put("studentCriteria", studentCriteria);
    searchMap.put("middleAgedCriteria", middleAgedCriteria);

  }

  public Predicate<Person> getCriteria(String PredicateName) {
    Predicate<Person> target;

    target = searchMap.get(PredicateName);

    if (target == null) {

      System.out.println("Search Criteria not found... ");
      System.exit(1);
    
    }
      
    return target;

  }

  public static SearchCriteria getInstance() {
    return new SearchCriteria();
  }
}

