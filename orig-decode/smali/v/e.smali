.class public final Lv/e;
.super Lw8/c;


# instance fields
.field public a:Lv/j;

.field public b:Lm9/d0;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lv/j;

.field public e:I


# direct methods
.method public constructor <init>(Lv/j;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lv/e;->d:Lv/j;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lv/e;->c:Ljava/lang/Object;

    iget p1, p0, Lv/e;->e:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lv/e;->e:I

    iget-object p1, p0, Lv/e;->d:Lv/j;

    const/4 v0, 0x0

    invoke-static {p1, p0, v0}, Lv/j;->H0(Lv/j;Lu8/e;Lm9/d0;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
