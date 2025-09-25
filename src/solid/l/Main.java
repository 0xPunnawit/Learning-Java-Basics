package solid.l;

import java.util.List;

public class Main {

    public static void main(String[] args) {

// BAD

//        List<solid.l.bad.Player> players = List.of(
//                new solid.l.bad.FreePlayer("Mart Free"),
//                new solid.l.bad.BattlePassPlayer("Mart BattlePass"),
//                new solid.l.bad.VipPlayer("Mart VIP")
//        );
//
//        for (solid.l.bad.Player p : players) {
//            p.joinBattleRoyal();
//        }

        // GOOD
        List<solid.l.good.ViewBattleRoyal> playersWhoCanView = List.of(
                new solid.l.good.FreePlayer("Mart Free"),
                new solid.l.good.BattlePassPlayer("Mart BattlePass"),
                new solid.l.good.VipPlayer("Mart VIP")
        );
        // Only accept view behavior elements
        for (solid.l.good.ViewBattleRoyal p : playersWhoCanView) {
            p.viewBattleRoyal();
        }

        List<solid.l.good.JoinBattleRoyal> playersWhoCanJoin = List.of(
                new solid.l.good.BattlePassPlayer("Mart BattlePass"),
                new solid.l.good.VipPlayer("Mart VIP")
        );
        // Only accept join behavior elements
        for (solid.l.good.JoinBattleRoyal p : playersWhoCanJoin) {
            p.joinBattleRoyal();
        }

        List<solid.l.good.CreateBattleRoyal> playersWhoCanCreate = List.of(
                new solid.l.good.VipPlayer("Mart VIP")
        );
        // Only accept create behavior elements
        for (solid.l.good.CreateBattleRoyal p : playersWhoCanCreate) {
            p.createBattleRoyal();
        }
    }
}