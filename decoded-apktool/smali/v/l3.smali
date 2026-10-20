.class public final Lv/l3;
.super Lw8/c;


# instance fields
.field public a:Lv/m3;

.field public b:Lq8/a;

.field public c:Lc9/a;

.field public d:F

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lv/m3;

.field public n:I


# direct methods
.method public constructor <init>(Lv/m3;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/l3;->f:Lv/m3;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lv/l3;->e:Ljava/lang/Object;

    iget p1, p0, Lv/l3;->n:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/l3;->n:I

    iget-object p1, p0, Lv/l3;->f:Lv/m3;

    const/4 v0, 0x0

    invoke-virtual {p1, v0, v0, p0}, Lv/m3;->a(Lb/g;Lt/l0;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
