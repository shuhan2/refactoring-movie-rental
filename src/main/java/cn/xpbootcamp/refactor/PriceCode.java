package cn.xpbootcamp.refactor;

public enum PriceCode {
  CAMPUS(2),
  HISTORY(0),
  NEW_RELEASE(1);

  private int code;

  PriceCode(int code) {
    this.code = code;
  }
}
