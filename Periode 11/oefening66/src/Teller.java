public class Teller {
  // Attributen
  private int waarde;
  
  // Getter
  public int getWaarde() {
    return waarde;
  }
    
  // Setter
  public void setWaarde( int waarde ) {
    this.waarde = waarde;
  }

  // Andere methoden
  public void increase() {
  	waarde++;
  }

  public void decrease() {
  	waarde--;
  }
}
