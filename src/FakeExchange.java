public  class FakeExchange implements Exchange {
  @Override
  public  float rate(String origin, String target){
    return 0.96f;
  }
}