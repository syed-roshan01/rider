.class public final Lk0/a2;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final a:I

.field public final b:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/Object;I)V
    .locals 2

    iput p2, p0, Lk0/a2;->a:I

    iput-object p1, p0, Lk0/a2;->b:Ljava/lang/Object;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Ldagger/hilt/ۣ۟ۧۤ۠;->۟ۦ۟ۡ()I

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
    const-string v0, "NqEtn4mnaiHiM"

    invoke-static {v0}, La/ۥۡۢۨ;->۟ۥۡۦ(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(F)V

    :sswitch_3
    return-void

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_2
        0xef -> :sswitch_3
    .end sparse-switch
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .locals 3

    invoke-static {p0}, Lx7/۟۟ۦۨۡ;->۟ۤۢۧۥ(Ljava/lang/Object;)I

    move-result v1

    invoke-static {p0}, Lv8/۟ۧۢ۟ۢ;->۟ۦۧۦۣ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    packed-switch v1, :pswitch_data_0

    check-cast v0, Lk0/m4;

    invoke-static {v0}, Ldagger/hilt/android/internal/modules/ۨۡ۠۠;->۟ۢ۠۟ۢ(Ljava/lang/Object;)Lh0/b1;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    check-cast v0, Lc9/a;

    invoke-static {v0}, Le2/۟۟ۥۦ;->ۨۧۧۧ(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-static {v0}, Lcom/google/firebase/installations/interop/۠ۨۧ۠;->۟ۡۧۦۡ(Ljava/lang/Object;)F

    move-result v0

    const/4 v1, 0x0

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v0, v1, v2}, Lz3/۟ۡ۠ۦۣ;->۟ۡۧۢۨ(FFF)F

    move-result v0

    invoke-static {v0}, Ld4/۟۠۠۟ۢ;->ۣۤ۟۠(F)Ljava/lang/Float;

    move-result-object v0

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
