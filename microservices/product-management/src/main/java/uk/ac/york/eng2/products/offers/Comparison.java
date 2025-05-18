package uk.ac.york.eng2.products.offers;

import java.math.BigDecimal;

public enum Comparison {
  EQUAL {
    public boolean compare(BigDecimal a, BigDecimal b) {
      return a.compareTo(b) == 0;
    }
  },
  NOT_EQUAL {
    public boolean compare(BigDecimal a, BigDecimal b) {
      return a.compareTo(b) != 0;
    }
  },
  LESS_THAN {
    public boolean compare(BigDecimal a, BigDecimal b) {
      return a.compareTo(b) < 0;
    }
  },
  LESS_THAN_EQUAL {
    public boolean compare(BigDecimal a, BigDecimal b) {
      return a.compareTo(b) <= 0;
    }
  },
  GREATER_THAN {
    public boolean compare(BigDecimal a, BigDecimal b) {
      return a.compareTo(b) > 0;
    }
  },
  GREATER_THAN_EQUAL {
    public boolean compare(BigDecimal a, BigDecimal b) {
      return a.compareTo(b) >= 0;
    }
  };

  public abstract boolean compare(BigDecimal a, BigDecimal b);
}
