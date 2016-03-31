/**
 * reference: https://www.cs.bu.edu/~hwxi/academic/courses/CS320/Spring02/assignments/06/basic-strategy.html
 */

public static void StrategyMethod(int playerCard1Value, int playerCard2Value, int totalDealer) {

  /**
   * P for split
   * D for double down
   * H for hit
   * S for stand
   */
  char bestMove = '';
  int ace = 11 | 1;

  int totalPlayer = playerCard1Value + playerCard2Value;
  System.out.println("Dealer Total is: " + totalDealer);
  System.out.println("Player's 1st Card is: " + playerCard1Value);
  System.out.println("Player's 2nd Card is: " + playerCard2Value);
  System.out.println("Player Total is: " + totalPlayer);

  /**
   * if player hand = 8
   * double on dealer hands 5 to 6
   * otherwise hit
   */
  int dealerHandfor8 = 5 || 6;

  if (playerCard1Value <= 8 || totalPlayer <= 8) {
    if (totalDealer == (dealerHandfor8))
      bestMove = 'D';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = 9
   * double on dealer hands 2 to 6
   * otherwise hit
   */
  int dealerHandfor9 = 2 || 3 || 4 || 5 || 6;

  if (playerCard1Value == 9 || totalPlayer == 9) {
    if (totalDealer == (dealerHandfor9))
      bestMove = 'D';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = 10
   * double on dealer hands 2 to 9
   * otherwise hit
   */
  int dealerHandfor10 = 2 || 3 || 4 || 5 || 6 || 7 || 8 || 9;

  if (playerCard1Value == 10 || totalPlayer == 10) {
    if (totalDealer == (dealerHandfor10))
      bestMove = 'D';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = 11
   * always double
   */
  if (playerCard1Value == 11 || totalPlayer == 11)
    bestMove = 'D';

  /**
   * if player hand = 12
   * stand on dealer hands 4 to 6
   * otherwise hit
   */
  int dealerHandfor12 = 4 || 5 || 6;

  if (playerCard1Value == 12 || totalPlayer == 12) {
    if (totalDealer == (dealerHandfor12))
      bestMove = 'S';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = 13 to 16
   * stand on dealer hands 2 to 6
   * otherwise hit
   */
  int playerHandfor13to16 = 13 || 14 || 15 || 16;
  int dealerHandfor13to16 = 2 || 3 || 4 || 5 || 6;

  if (playerCard1Value == (playerHandfor13to16) || totalPlayer == (playerHandfor13to16)) {
    if (totalDealer == (dealerHandfor13to16))
      bestMove = 'S';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = 17 to 21
   * always stand
   */
  int playerHandfor17to21 = 17 || 18 || 19 || 20 || 21;

  if (playerCard1Value == (playerHandfor17to21) || totalPlayer == (playerHandfor17to21))
    bestMove = 'S';

  /**
   * if player hand = A, 2 to A, 5
   * double on dealer hands 4 to 6
   * otherwise hit
   */
  int playerHand2forA2toA5 = 2 || 3 || 4 || 5;
  int dealerHandforA2toA5 = 4 || 5 || 6;

  if (playerCard1Value == ace && playerCard2Value == (playerHand2forA2toA5)) {
    if (totalDealer == (dealerHandforA2toA5))
      bestMove = 'D';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = A, 2 to A, 5
   * double on dealer hands 4 to 6
   * otherwise hit
   */
  int playerHand2forA2toA5 = 2 || 3 || 4 || 5;
  int dealerHandforA2toA5 = 4 || 5 || 6;

  if (playerCard1Value == ace && playerCard2Value == (playerHand2forA2toA5)) {
    if (totalDealer == (dealerHandforA2toA5))
      bestMove = 'D';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = A, 6
   * double on dealer hands 2 to 6
   * otherwise hit
   */
  int dealerHandforA6 = 2 || 3 || 4 || 5 || 6;

  if (playerCard1Value == ace && playerCard2Value == 6) {
    if (totalDealer == (dealerHandforA6))
      bestMove = 'D';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = A, 7
   * double on dealer hands 3 to 6
   * stand on dealer hands 2, 7, 8, or Ace
   * otherwise hit
   */
  int dealerHandforA7_double = 3 || 4 || 5 || 6;
  int dealerHandforA7_stand = 2 || 7 || 8 || ace;

  if (playerCard1Value == ace && playerCard2Value == 7) {
    if (totalDealer == (dealerHandforA7_double))
      bestMove = 'D';
    else if (totalDealer == (dealerHandforA7_stand))
      bestMove = 'S';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = A, 8
   * double on dealer hand 6
   * otherwise stand
   */
  if (playerCard1Value == ace && playerCard2Value == 8) {
    if (totalDealer == 6)
      bestMove = 'D';
    else
      bestMove = 'S';
  }

  /**
   * if player hand = A, 9
   * always stand
   */
  if (playerCard1Value == ace && playerCard2Value == 9)
    bestMove = 'S';

  /**
   * if player hand = A, A
   * always split
   */
  if (playerCard1Value == ace && playerCard2Value == ace)
    bestMove = 'P';

  /**
   * if player hand = 2, 2
   * split on dealer hands 3 to 7
   * otherwise hit
   */
  int dealerHandfor2_2 = 3 || 4 || 5 || 6 || 7;

  if (playerCard1Value == 2 && playerCard2Value == 2) {
    if (totalDealer == (dealerHandfor2_2))
      bestMove = 'P';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = 3, 3
   * split on dealer hands 4 to 7
   * otherwise hit
   */
  int dealerHandfor3_3 = 4 || 5 || 6 || 7;

  if (playerCard1Value == 3 && playerCard2Value == 3) {
    if (totalDealer == (dealerHandfor3_3))
      bestMove = 'P';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = 4, 4
   * double on dealer hands 5 to 6
   * otherwise hit
   */
  int dealerHandfor4_4 = 5 || 6;

  if (playerCard1Value == 4 && playerCard2Value == 4) {
    if (totalDealer == (dealerHandfor4_4))
      bestMove = 'D';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = 5, 5
   * double on dealer hands 2 to 9
   * otherwise hit
   */
  int dealerHandfor5_5 = 2 || 3 || 4 || 5 || 6 || 7 || 8 || 9;

  if (playerCard1Value == 5 && playerCard2Value == 5) {
    if (totalDealer == (dealerHandfor5_5))
      bestMove = 'D';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = 6, 6
   * split on dealer hands 2 to 6
   * otherwise hit
   */
  int dealerHandfor6_6 = 2 || 3 || 4 || 5 || 6;

  if (playerCard1Value == 6 && playerCard2Value == 6) {
    if (totalDealer == (dealerHandfor6_6))
      bestMove = 'P';
    else
      bestMove = 'H';
  }

  /**
   * if player hand = 7, 7
   * split on dealer hands 2 to 7
   * stand on 10
   * otherwise hit
   */
  int dealerHandfor7_7 = 2 || 3 || 4 || 5 || 6 || 7;

  if (playerCard1Value == 7 && playerCard2Value == 7) {
    if (totalDealer == (dealerHandfor7_7))
      bestMove = 'P';
    else if (totalDealer == 10)
      bestMove = 'S';
    else
      bestMove = 'H';
  }


  /**
   * if player hand = 8, 8
   * always split
   */
  if (playerCard1Value == 8 && playerCard2Value == 8)
    bestMove = 'P';

  /**
   * if player hand = 9, 9
   * split on 2 to 9 except 7
   * stand on 7, 10, or Ace
   */
  int dealerHandfor9_9 = 2 || 3 || 4 || 5 || 6 || 8 || 9;

  if (playerCard1Value == 7 && playerCard2Value == 7) {
    if (totalDealer == (dealerHandfor9_9))
      bestMove = 'P';
    else
      bestMove = 'S';
  }

  /**
   * if player hand = 10, 10
   * always stand
   */
  if (playerCard1Value == 10 && playerCard2Value == 10)
    bestMove = 'S';

  /**
   * return best move
   */
  return bestMove;

}
