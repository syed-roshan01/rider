.class public final synthetic Lo9/d;
.super Ld9/h;

# interfaces
.implements Lc9/e;


# static fields
.field public static final p:Lo9/d;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v6, Lo9/d;

    const/4 v1, 0x2

    const-class v2, Lo9/e;

    const-string v3, "createSegment"

    const-string v4, "createSegment(JLkotlinx/coroutines/channels/ChannelSegment;)Lkotlinx/coroutines/channels/ChannelSegment;"

    const/4 v5, 0x1

    move-object v0, v6

    invoke-direct/range {v0 .. v5}, Ld9/h;-><init>(ILjava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    sput-object v6, Lo9/d;->p:Lo9/d;

    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    move-object v3, p2

    check-cast v3, Lo9/k;

    sget-object p1, Lo9/e;->a:Lo9/k;

    new-instance p1, Lo9/k;

    iget-object v4, v3, Lo9/k;->e:Lo9/c;

    invoke-static {v4}, Ld7/a;->j(Ljava/lang/Object;)V

    const/4 v5, 0x0

    move-object v0, p1

    invoke-direct/range {v0 .. v5}, Lo9/k;-><init>(JLo9/k;Lo9/c;I)V

    return-object p1
.end method
