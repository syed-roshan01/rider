.class public final La5/t;
.super Lw8/c;


# instance fields
.field public a:Ljava/lang/Object;

.field public final b:La5/z;

.field public c:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public constructor <init>(La5/z;Lu8/e;)V
    .locals 2

    iput-object p1, p0, La5/t;->b:La5/z;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    invoke-static {}, Li5/ۢۤۡ;->ۣ۟۟ۦۦ()I

    move-result v1

    const/16 v0, 0x650

    :goto_0
    xor-int/lit16 v0, v0, 0x661

    sparse-switch v0, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v0, 0x68e

    goto :goto_0

    :sswitch_1
    if-ltz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "GzpZCaw8qBmeIRw3L53Ng"

    invoke-static {v0}, Lca/ۨۤۢۥ;->۟ۦۧۧ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(Ljava/lang/String;)Ljava/lang/Float;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

    :sswitch_3
    return-void

    nop

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    const/4 v4, 0x0

    const/high16 v3, -0x80000000

    const/4 v1, 0x0

    iput-object p1, p0, La5/t;->a:Ljava/lang/Object;

    invoke-static {p0}, Landroid/support/v4/app/۟۟۠ۡۥ;->۟۟ۧۦۤ(Ljava/lang/Object;)I

    move-result v0

    xor-int v2, v0, v3

    and-int/2addr v0, v3

    or-int/2addr v0, v2

    iput v0, p0, La5/t;->c:I

    invoke-static {p0}, Lea/۟ۦۢۦۤ;->ۣ۟ۦۨ۟(Ljava/lang/Object;)La5/z;

    move-result-object v0

    move-object v2, v1

    move-object v3, v1

    move-object v5, v1

    move v6, v4

    move-object v7, p0

    invoke-static/range {v0 .. v7}, Lx4/۟ۤۦۥ۟;->ۤۡۦۦ(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ILjava/lang/Object;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    invoke-static {}, Lh0/۟ۥ۟ۡۦ;->ۣۧۡۢ()Lv8/a;

    move-result-object v2

    const/16 v1, 0x650

    :goto_0
    xor-int/lit16 v1, v1, 0x661

    sparse-switch v1, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v1, 0x68e

    goto :goto_0

    :sswitch_1
    if-ne v0, v2, :cond_0

    const/16 v1, 0x6ad

    goto :goto_0

    :sswitch_2
    new-instance v1, Lq8/h;

    invoke-direct {v1, v0}, Lq8/h;-><init>(Ljava/lang/Object;)V

    move-object v0, v1

    :sswitch_3
    return-object v0

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch
.end method
