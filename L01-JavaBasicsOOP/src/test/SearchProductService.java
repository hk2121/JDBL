package test;

import java.util.List;

public class SearchProductService {

    private SortingAlgoInterface sortingAlgoInterface;
    List<String> searchProduct(){
        return null;
    }

    List<String> searchProductWithSortedOrder(){
        List<String> result = searchProduct();
        sortingAlgoInterface.sort(result);
        return result;
    }
}
