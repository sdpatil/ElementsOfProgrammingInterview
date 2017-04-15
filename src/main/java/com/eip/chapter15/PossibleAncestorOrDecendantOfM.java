package com.eip.chapter15;

/**
 * Created by sunilpatil on 4/4/17.
 */
public class PossibleAncestorOrDecendantOfM {

    public boolean pairIncludesAncestorAndDescendantOfM(
            BSTNode<Integer> possibleAD1, BSTNode<Integer> possibleAD2, BSTNode<Integer> middle){
        BSTNode<Integer> search1 = middle;
        BSTNode<Integer> search2 = possibleAD2;

        while (search1 != possibleAD2 && search1 != middle &&
                search1 != possibleAD2 && search2 != middle && (
                        search1 != null && search2 != null
                )){
            if(search1 != null){
                search1 = search1.data > middle.data ? search1.left: search1.right;
            }
            if(search2 != null){
                search2 = search2.data > middle.data ? search2.left: search2.right;
            }
        }

        if(search1 == possibleAD2 || search2 == possibleAD1 || (search1 !=middle && search2 != middle))
            return false;


     return search1 == middle ? searchTarget(middle, possibleAD2): searchTarget(middle,possibleAD1);
    }

    private boolean searchTarget(BSTNode<Integer> from, BSTNode<Integer> to){
                while (from != null && from != to){
                    from = from.data > to.data ? from.left : from.right;
                }
                return from == to;
    }
}
