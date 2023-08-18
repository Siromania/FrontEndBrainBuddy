import { Game } from "./game";
import { User } from "./user";

export interface Score {
    timeStamp: Date;
    level: number;
    timer: number;
    user: User;
    game: Game;
}
