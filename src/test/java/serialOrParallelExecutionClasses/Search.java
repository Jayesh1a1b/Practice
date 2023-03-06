package serialOrParallelExecutionClasses;

import org.testng.annotations.Test;

public class Search {
  @Test(priority=1)
  public void searchValidProduct()
  {
	  System.out.println("Search->searchValidProduct->"+Thread.currentThread().getId());
  }
  @Test(priority=2)
  public void searchWithInValidProduct()
  {
	  System.out.println("Search->searchWithInValidProduct->"+Thread.currentThread().getId());
  }
  @Test(priority=3)
  public void searchNoProduct()
  {
	  System.out.println("Search->searchNoProduct->"+Thread.currentThread().getId());
  }
}
