package VimalSingh;

import java.util.LinkedList;
import java.util.Queue;

/*
Level by level traversal
Geeks for Geeks Question from Lecture
 */
public class LevelByLevelTraversal {

    public static void main(String[] args) {
        BinaryNode node = new BinaryNode(10);
        //left tree structure
        node.left = new BinaryNode(20);
        node.left.left= new BinaryNode(40);
        node.left.right= new BinaryNode(50);
        node.left.right.left= new BinaryNode(70);
        node.left.right.right = new BinaryNode(80);
        //right tree structure
        node.right = new BinaryNode(30);
        node.right.right= new BinaryNode(60);

        levelByLevelTraversal(node);
    }


    private static void levelByLevelTraversal(BinaryNode node) {

        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(node);
        queue.add(null);

        while (queue.size()>1){
            BinaryNode curr= queue.poll();
            if (curr==null){
                System.out.println();
                queue.add(null);
                continue;

            }

            System.out.println(curr.key);
            if(curr.left!=null)
                queue.add(curr.left);
            if(curr.right!=null)
                queue.add(curr.right);
        }
    }

/*
        in the first iteration queue.add(10) and q.add(null) so q is not null
        print 10 i.e curr.key
        q.add(20) and q.add(30)
        in the 2nd iteration queue is empty because null appears
        so, in queue we have now 20,30,null
        print 20
        q.add(40), q.add(50)
        now Queue become 30,null,40,50
        third iteration
        curr is not null so
        print 30
        then q.add(60)
        now queue become null,40,50,60
        then 4th iteration
        print 40 then 50
        q.add(null), q.add(70),q,add(80)
        print 70,80
     */

}
