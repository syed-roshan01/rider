.class public final Lf0/l0;
.super Ljava/lang/Object;

# interfaces
.implements Lr1/j0;


# static fields
.field public static final a:Lf0/l0;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Lf0/l0;

    invoke-direct {v0}, Lf0/l0;-><init>()V

    sput-object v0, Lf0/l0;->a:Lf0/l0;

    return-void
.end method


# virtual methods
.method public final e(Lr1/l0;Ljava/util/List;J)Lr1/k0;
    .locals 9

    const/4 v5, 0x0

    const/4 v1, 0x0

    const-string v7, "\u06e0\u06e1\u06e1"

    move-object v0, v1

    move-object v2, v1

    move-object v3, v1

    move v4, v5

    move v6, v5

    :goto_0
    invoke-static {v7}, Lcom/google/firebase/annotations/concurrent/ۣ۟ۧۥۨ;->۟۟۟۠ۦ(Ljava/lang/Object;)I

    move-result v1

    sparse-switch v1, :sswitch_data_0

    invoke-static {p3, p4}, Lu1/۟ۧۥۢ۠;->ۨۤ۠ۧ(J)I

    move-result v1

    const-string v5, "\u06e4\u06e3\u06df"

    move v4, v1

    move-object v7, v5

    goto :goto_0

    :sswitch_0
    invoke-static {}, Lcom/google/firebase/annotations/ۣۢۢۦ;->۟ۢ۠ۨ۟()Lr8/s;

    move-result-object v1

    const-string v5, "\u06e7\u06e2\u06e1"

    move-object v3, v1

    move-object v7, v5

    goto :goto_0

    :sswitch_1
    invoke-static {p3, p4}, Lcom/google/firebase/iid/internal/ۨۡۥۦ;->۟ۡۦۡ(J)I

    move-result v5

    const-string v1, "\u06e7\u06e2\u06e3"

    move v6, v5

    move-object v7, v1

    goto :goto_0

    :sswitch_2
    invoke-static {}, Lj9/۠۠ۨ;->ۡۨ۠ۧ()Lf0/j;

    move-result-object v1

    const-string v5, "\u06e1\u06e8\u06e3"

    move-object v2, v1

    move-object v7, v5

    goto :goto_0

    :sswitch_3
    invoke-static {p1, v6, v4, v3, v2}, Ls0/ۧۧۨۥ;->ۣ۟ۤۡۥ(Ljava/lang/Object;IILjava/lang/Object;Ljava/lang/Object;)Lr1/k0;

    move-result-object v0

    const-string v1, "\u06e8\u06e1\u06e0"

    move-object v7, v1

    goto :goto_0

    :sswitch_4
    return-object v0

    nop

    :sswitch_data_0
    .sparse-switch
        0x1aab00 -> :sswitch_1
        0x1aaf9c -> :sswitch_0
        0x1aba40 -> :sswitch_2
        0x1ac566 -> :sswitch_3
        0x1ac907 -> :sswitch_4
    .end sparse-switch
.end method
