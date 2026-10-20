.class public final Lb0/k0;
.super Lb0/h0;


# static fields
.field public static final F:La/a;

.field public static final G:Lv0/p;


# instance fields
.field public final E:Lm0/n1;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, La/a;

    const/16 v1, 0x13

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, La/a;-><init>(II)V

    sput-object v0, Lb0/k0;->F:La/a;

    sget-object v0, Lb0/i0;->a:Lb0/i0;

    sget-object v1, Lb0/u;->c:Lb0/u;

    invoke-static {v0, v1}, Lm9/e0;->F(Lc9/e;Lc9/c;)Lv0/p;

    move-result-object v0

    sput-object v0, Lb0/k0;->G:Lv0/p;

    return-void
.end method

.method public constructor <init>(IFLc9/a;)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lb0/h0;-><init>(IF)V

    sget-object p1, Lm0/o3;->a:Lm0/o3;

    invoke-static {p3, p1}, Ld7/t;->g0(Ljava/lang/Object;Lm0/z2;)Lm0/n1;

    move-result-object p1

    iput-object p1, p0, Lb0/k0;->E:Lm0/n1;

    return-void
.end method


# virtual methods
.method public final k()I
    .locals 1

    iget-object v0, p0, Lb0/k0;->E:Lm0/n1;

    invoke-virtual {v0}, Lm0/y2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lc9/a;

    invoke-interface {v0}, Lc9/a;->invoke()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Number;

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    return v0
.end method
