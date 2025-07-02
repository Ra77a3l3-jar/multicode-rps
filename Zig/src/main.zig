const std = @import("std");
const print = std.debug.print;
pub fn choices() void {
    print("Rock - Paper - Scissors Game!\n\n", .{});
    print("Enter: (r)ock, (p)aper or (s)cissors\n\n", .{});
}
pub fn getPlayerChoice() !u8 {
    print("Enter your choice: \n", .{});
    var buf: [1]u8 = undefined; // buffer to contain character
    var choice: u8 = 0;
    while (true) {
        var stdin = std.io.getStdIn().reader(); // get standard input
        try stdin.readNoEof(&buf); // read one byte from input
        choice = buf[0]; // here saves the charater
        if ((choice == 'r') or (choice == 'p') or (choice == 's')) {
            break;
        }
        print("Wrong input, try again: \n", .{});
    }
    return choice;
}
pub fn getComputerChoice() u8 {
    var random: u8 = 0;
    var prng = std.Random.DefaultPrng.init(42); // init(x) is the fixed seed
    const rand = prng.random();
    random = rand.uintLessThan(u8, 3); // gives 0, 1, or 2
    switch (random) {
        0 => return 'r',
        1 => return 'p',
        2 => return 's',
        else => unreachable,
    }
}
pub fn displayChoices(player: u8, computer: u8) void {
    print("You choose: ", .{});
    switch (player) {
        'r' => print("Rock\n", .{}),
        'p' => print("Paper\n", .{}),
        's' => print("Scissors\n", .{}),
        else => {},
    }
    print("The computer choose: ", .{});
    switch (computer) {
        'r' => print("Rock\n", .{}),
        'p' => print("Paper\n", .{}),
        's' => print("Scissors\n", .{}),
        else => {},
    }
}
pub fn declareWinner(player: u8, computer: u8) i8 {
    if (player == computer) {
        return 0;
    }
    if ((player == 'r' and computer == 's') or
        (player == 's' and computer == 'p') or
        (player == 'p' and computer == 'r'))
    {
        return 1;
    }
    return -1;
}
pub fn playAgain() !bool {
    print("Do you want to play again? \n", .{});
    var buf: [10]u8 = undefined;
    var stdin = std.io.getStdIn().reader();
    if (try stdin.readUntilDelimiterOrEof(&buf, '\n')) |input| {
        if (input.len > 0) {
            return (input[0] == 'y');
        }
    }
    return false;
}
pub fn main() !void {
    var again: bool = true;
    while (again) {
        choices();
        const player: u8 = try getPlayerChoice();
        const computer: u8 = getComputerChoice();
        displayChoices(player, computer);
        const winner: i8 = declareWinner(player, computer);
        switch (winner) {
            0 => print("The match is a tie\n", .{}),
            1 => print("The player wins\n", .{}),
            -1 => print("The computer wins\n", .{}),
            else => {},
        }
        again = try playAgain();
    }
    print("Thanks for playing\n", .{});
}
