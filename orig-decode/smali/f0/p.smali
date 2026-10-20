.class public final Lf0/p;
.super Ld9/j;

# interfaces
.implements Lc9/c;


# instance fields
.field public final a:I

.field public final b:Lh0/v0;


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public synthetic constructor <init>(Lh0/v0;I)V
    .locals 2

    iput p2, p0, Lf0/p;->a:I

    iput-object p1, p0, Lf0/p;->b:Lh0/v0;

    const/4 v0, 0x1

    invoke-direct {p0, v0}, Ld9/j;-><init>(I)V

    invoke-static {}, Lcom/google/gson/internal/bind/۟ۨۥ;->۟ۢۨۨۦ()I

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
    if-gtz v1, :cond_0

    const/16 v0, 0x6ad

    goto :goto_0

    :sswitch_2
    const-string v0, "bFmkcvsv4"

    invoke-static {v0}, Ly6/۟ۢ۟ۥۤ;->۠ۡ۠(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Ljava/lang/Integer;->decode(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ljava/lang/System;->out:Ljava/io/PrintStream;

    invoke-virtual {v1, v0}, Ljava/io/PrintStream;->println(Ljava/lang/Object;)V

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
.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    invoke-static {p0}, Lt0/ۣ۟۠ۡۢ;->۟ۡ۟۠۠(Ljava/lang/Object;)I

    move-result v0

    invoke-static {p0}, Lu/ۣۤۧ۠;->ۢۨۤۨ(Ljava/lang/Object;)Lh0/v0;

    move-result-object v1

    packed-switch v0, :pswitch_data_0

    check-cast p1, Ld1/c;

    invoke-static {p1}, Laa/۟ۦۣۢۨ;->۠۟ۢۤ(Ljava/lang/Object;)J

    invoke-static {v1}, Landroidx/compose/ui/graphics/ۦۦۡۦ;->ۥۤۨ(Ljava/lang/Object;)V

    invoke-static {}, Laa/۟ۦۣۢۨ;->ۣۧ۟ۡ()Lq8/l;

    move-result-object v0

    :goto_0
    return-object v0

    :pswitch_0
    check-cast p1, Lm0/o0;

    new-instance v0, Lb/c;

    sget v2, Lcom/google/firebase/appcheck/interop/۟ۥۢ۟ۤ;->ۣۨۢۦ:I

    xor-int/lit16 v2, v2, 0x2f5

    invoke-direct {v0, v1, v2}, Lb/c;-><init>(Ljava/lang/Object;I)V

    goto :goto_0

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
