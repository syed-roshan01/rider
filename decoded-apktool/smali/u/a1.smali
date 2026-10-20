.class public final Lu/a1;
.super Lw8/c;


# instance fields
.field public a:Lu/d1;

.field public synthetic b:Ljava/lang/Object;

.field public final synthetic c:Lu/d1;

.field public d:I


# direct methods
.method public constructor <init>(Lu/d1;Lu8/e;)V
    .locals 0

    iput-object p1, p0, Lu/a1;->c:Lu/d1;

    invoke-direct {p0, p2}, Lw8/c;-><init>(Lu8/e;)V

    return-void
.end method


# virtual methods
.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    iput-object p1, p0, Lu/a1;->b:Ljava/lang/Object;

    iget p1, p0, Lu/a1;->d:I

    const/high16 v0, -0x80000000

    or-int/2addr p1, v0

    iput p1, p0, Lu/a1;->d:I

    iget-object p1, p0, Lu/a1;->c:Lu/d1;

    invoke-virtual {p1, p0}, Lu/d1;->H0(Lu8/e;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
