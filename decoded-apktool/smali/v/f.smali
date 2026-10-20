.class public final Lv/f;
.super Lw8/c;


# instance fields
.field public a:Lv/j;

.field public b:Lm9/d0;

.field public c:Lv/b0;

.field public d:Lx/b;

.field public synthetic e:Ljava/lang/Object;

.field public final synthetic f:Lv/j;

.field public n:I


# direct methods
.method public constructor <init>(Lv/j;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/f;->f:Lv/j;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lv/f;->e:Ljava/lang/Object;

    iget p1, p0, Lv/f;->n:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/f;->n:I

    iget-object p1, p0, Lv/f;->f:Lv/j;

    const/4 v0, 0x0

    invoke-static {p1, v0, v0, p0}, Lv/j;->I0(Lv/j;Lm9/d0;Lv/b0;Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
