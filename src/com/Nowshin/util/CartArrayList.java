package com.Nowshin.util;

import java.util.ArrayList;
import com.Nowshin.Cart;

public class CartArrayList extends ArrayList<Cart> {
    private static final long serialVersionUID = 1L;

    @Override
    public void removeRange(int fromIndex, int toIndex) {
        super.removeRange(fromIndex, toIndex);
    }
}
