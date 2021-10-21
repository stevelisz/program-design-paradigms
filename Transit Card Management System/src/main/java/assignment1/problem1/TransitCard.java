package assignment1.problem1;

/**
 * This class represents transit card.
 */

public class TransitCard {

  private CardOwner cardOwner;
  private CurrentCardBalance cardBalance;

  /**
   * constructor that constructs following properties.
   *
   * @param cardOwner   a card owner.
   * @param cardBalance card's current balance.
   */
  public TransitCard(CardOwner cardOwner, CurrentCardBalance cardBalance) {
    this.cardOwner = cardOwner;
    this.cardBalance = cardBalance;

  }

  /**
   * This methods implements the function that deposit money into a transit card. And current card
   * balance changes.
   *
   * @param newDeposit deposit behavior with amount and card owner's info.
   */
  public void depositMoney(Deposit newDeposit) {
    if (newDeposit.getFirstName() != cardOwner.getFirstName()
        || newDeposit.getLastName() != cardOwner.getLastName()) {
      throw new IllegalArgumentException("Invalid cardholder information.");

    }
    int currDollar = cardBalance.getDollars() + newDeposit.getDollars();
    int currCent = cardBalance.getCents() + newDeposit.getCents();
    if (currCent > 99) {
      cardBalance.setDollars(currDollar + 1);
    } else {
      cardBalance.setDollars(currDollar);
    }
    cardBalance.setCents(currCent % 99 - 1);

    System.out.println(
        "Deposit successfully, current card balance is: $" + cardBalance.getDollars() + "."
            + cardBalance.getCents());
  }

  /**
   * get card owner of the transit card.
   *
   * @return the card owner as a CardOwner object.
   */
  public CardOwner getCardOwner() {
    return cardOwner;
  }

  /**
   * set card owner of the transit card.
   *
   * @param cardOwner
   */
  public void setCardOwner(CardOwner cardOwner) {
    this.cardOwner = cardOwner;
  }

  /**
   * get current card balance.
   *
   * @return current balance as a CurrentCardBalance object.
   */
  public CurrentCardBalance getCardBalance() {
    return cardBalance;
  }

  /**
   * set current card balance.
   *
   * @param cardBalance
   */
  public void setCardBalance(CurrentCardBalance cardBalance) {
    this.cardBalance = cardBalance;
  }


}
