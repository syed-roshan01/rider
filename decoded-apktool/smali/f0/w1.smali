.class public final Lf0/w1;
.super Ld9/j;

# interfaces
.implements Lc9/a;


# instance fields
.field public final a:I

.field public final b:Lf0/a2;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lf0/a2;I)V
    .locals 2

    iput p2, p0, Lf0/w1;->a:I

    iput-object p1, p0, Lf0/w1;->b:Lf0/a2;

    const/4 v0, 0x0

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lf0/ۣۦۦ۠;->۟ۥۥۣۢ()I

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
    const-string v0, "OnSCu"

    invoke-static {v0}, Lt8/ۦۣ۠;->ۦۣ۟(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

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
.method public final a()Ljava/lang/Boolean;
    .locals 5

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0}, Lv6/۟ۦۣۧۦ;->۟ۦۡۢۢ(Ljava/lang/Object;)I

    move-result v2

    invoke-static {p0}, Lf4/ۡۤۡ;->۟ۤۧۥ۟(Ljava/lang/Object;)Lf0/a2;

    move-result-object v3

    packed-switch v2, :pswitch_data_0

    invoke-static {v3}, Lt8/ۦۣ۠;->ۧۥۨ(Ljava/lang/Object;)Lm0/k1;

    move-result-object v2

    invoke-static {v2}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۡۧ۟ۡ(Ljava/lang/Object;)F

    move-result v4

    invoke-static {v3}, Landroidx/lifecycle/ۧۥۡۨ;->ۢۨ۟ۥ(Ljava/lang/Object;)Lm0/k1;

    move-result-object v2

    invoke-static {v2}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۡۧ۟ۡ(Ljava/lang/Object;)F

    move-result v3

    const/16 v2, 0x650

    :goto_0
    xor-int/lit16 v2, v2, 0x661

    sparse-switch v2, :sswitch_data_0

    goto :goto_0

    :cond_0
    :sswitch_0
    const/16 v2, 0x68e

    goto :goto_0

    :sswitch_1
    cmpg-float v2, v4, v3

    if-gez v2, :cond_0

    const/16 v2, 0x6ad

    goto :goto_0

    :sswitch_2
    move v0, v1

    :sswitch_3
    invoke-static {v0}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v0

    :goto_1
    return-object v0

    :pswitch_0
    invoke-static {v3}, Lt8/ۦۣ۠;->ۧۥۨ(Ljava/lang/Object;)Lm0/k1;

    move-result-object v2

    invoke-static {v2}, Landroidx/profileinstaller/۠ۡۥۡ;->۟ۡۧ۟ۡ(Ljava/lang/Object;)F

    move-result v3

    const/16 v2, 0x6cc

    :goto_2
    xor-int/lit16 v2, v2, 0x6dd

    sparse-switch v2, :sswitch_data_1

    goto :goto_2

    :sswitch_4
    const/4 v2, 0x0

    cmpl-float v2, v3, v2

    if-lez v2, :cond_1

    const/16 v2, 0x729

    goto :goto_2

    :cond_1
    :sswitch_5
    const/16 v2, 0x70a

    goto :goto_2

    :sswitch_6
    move v0, v1

    :sswitch_7
    invoke-static {v0}, La8/ۣۡۨ۠;->ۣۧ۠ۡ(Z)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch

    :sswitch_data_0
    .sparse-switch
        0xe -> :sswitch_0
        0x31 -> :sswitch_1
        0xcc -> :sswitch_3
        0xef -> :sswitch_2
    .end sparse-switch

    :sswitch_data_1
    .sparse-switch
        0x11 -> :sswitch_4
        0x36 -> :sswitch_5
        0x1d7 -> :sswitch_6
        0x1f4 -> :sswitch_7
    .end sparse-switch
.end method

.method public final bridge synthetic invoke()Ljava/lang/Object;
    .locals 1

    invoke-static {p0}, Lv6/۟ۦۣۧۦ;->۟ۦۡۢۢ(Ljava/lang/Object;)I

    move-result v0

    packed-switch v0, :pswitch_data_0

    invoke-static {p0}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->۟۠ۡۥۢ(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    invoke-static {p0}, Lcom/google/android/gms/internal/tasks/ۢ۠ۤۥ;->۟۠ۡۥۢ(Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object v0

    goto :goto_0

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
